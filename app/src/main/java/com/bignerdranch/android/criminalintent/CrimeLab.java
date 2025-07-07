package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * CrimeLab is a singleton class that acts as a central data store.
 * It manages a list of Crime objects and provides access methods for them.
 */
public class CrimeLab {

    // Static instance of CrimeLab - this makes the class a Singleton.
    private static CrimeLab sCrimeLab;

    // List to store all the crime records
    private List<Crime> mCrimes;

    /**
     * Returns the single instance of CrimeLab.
     * If it hasn't been created yet, this will create it.
     */
    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    /**
     * Returns the list of all crimes.
     */
    public List<Crime> getCrimes() {
        return mCrimes;
    }

    /**
     * Looks for and returns a specific crime by its UUID.
     * If not found, returns null.
     */
    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getmId().equals(id)) {
                return crime;
            }
        }
        return null;
    }

    /**
     * Private constructor — can only be called from within this class.
     * Initializes the crime list with 100 dummy crime objects for testing.
     */
    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setmTitle("Crime #" + i);           // Set title like "Crime #0", "Crime #1", etc.
            crime.setmSolved(i % 2 == 0);              // Every even-numbered crime is marked as solved
            mCrimes.add(crime);                        // Add it to the list
        }
    }
}
