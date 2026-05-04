package com.evembackend.enums;

public enum CategoryEnum {
    BUSINESS("business"),
    SOCIAL("social"),
    SPORTS("sports"),
    EDUCATION("education"),
    ENTERTAINMENT("entertainment"),
    MUSICAL_SHOWS("musicalShows"),
    COURSES("courses"),
    THEATER("theater"),
    TECHNOLOGY("technology"),
    GASTRONOMY("gastronomy"),
    RELIGIOUS("religious"),
    KIDS_AND_FAMILY("kidsAndFamily"),
    OTHER("other");

    private String name;

    CategoryEnum(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public static CategoryEnum fromName(String nameParam) 
    {
        for(CategoryEnum entry : CategoryEnum.values())
        {
            if(entry.name.equals(nameParam))
            {
                return entry;
            }   
        }

        throw new IllegalArgumentException("Nome Inválido");
    }
}


