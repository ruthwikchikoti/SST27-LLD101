package com.example.imports;

import java.nio.file.Path;
import java.util.List;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader csvReader;
    private final ProfileService profileService;

   CsvProfileImporter(NaiveCsvReader csvReader, ProfileService profileService) {
    this.csvReader = csvReader;
    this.profileService = profileService;
   }


    @Override
    public int importFrom(Path csvFile) {
        List<String[]> lines = csvReader.read(csvFile);
        int count = 0;
        
        for(String[] line : lines) {
            String id = line[0];
            String email = line[1];
            String displayName = line[2];
            
            if(id == null || email == null || id.isEmpty() || email.isEmpty()) {
                System.out.println("Skipping row: missing id or email");
                continue;
            }
            
            if(!email.contains("@")) {
                System.out.println("Skipping row: bad email format");
                continue;
            }
            
            profileService.createProfile(id, email, displayName);
            count++;
        }
        return count;
    }
}

