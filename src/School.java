package com.mycompany.simestate;

/**
 * This class represents a School, a subclass of Place. A School is an
 * educational institution that provides education to students of different
 * grades.
 */
public class School extends Place {

    private int ranking; // The ranking of the school, with 1 being the best and 100 being the worst.
    private boolean isPrivate; // Indicates whether the school is private or public.
    private double tuition; // The tuition fee for the school.
    private String schoolGrade; // The grade level of the school, e.g., Elementary, Secondary, Post-Secondary.
    private boolean hasIB; // Indicates whether the school offers the International Baccalaureate (IB) program.
    private boolean hasGifted; // Indicates whether the school offers a gifted program.
    private boolean hasFrench; // Indicates whether the school offers French language instruction.

    /**
     * Constructor to create a new School object with specified properties.
     *
     * @param address The address of the school.
     * @param id The unique identifier of the school.
     * @param name The name of the school.
     * @param ranking The ranking of the school, with in intervals of top 10, 20, 50 and 100+.
     * @param isPrivate True if the school is private, false if it is public.
     * @param tuition The tuition fee for the school.
     * @param schoolGrade The grade level of the school, e.g., Elementary, Secondary, Post-Secondary.
     * @param hasIB True if the school offers the International Baccalaureate (IB) program, false otherwise.
     * @param hasGifted True if the school offers a gifted program, false otherwise.
     * @param hasFrench True if the school offers French language instruction, false otherwise.
     */
    public School(String address, String id, String name, int ranking, boolean isPrivate,
            double tuition, String schoolGrade, boolean hasIB, boolean hasGifted, boolean hasFrench) {
        super(address, id, name);

        this.ranking = ranking;
        this.isPrivate = isPrivate;
        this.tuition = tuition;
        this.schoolGrade = schoolGrade;
        this.hasIB = hasIB;
        this.hasGifted = hasGifted;
        this.hasFrench = hasFrench;
    }

    /**
     * Get the ranking of the school, in intervals of top 10, 20, 50, and 100+
     *
     * @return The ranking of the school.
     */
    public int getRanking() {
        return ranking;
    }

    /**
     * Set the ranking of the school, in intervals of top 10, 20, 50, and 100+
     *
     * @param ranking The ranking of the school to be set.
     */
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    /**
     * Check if the school is private or public.
     *
     * @return True if the school is private, false if it is public.
     */
    public boolean isPrivate() {
        return isPrivate;
    }

    /**
     * Set whether the school is private or public.
     *
     * @param isPrivate True if the school is private, false if it is public.
     */
    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * Get the tuition fee for the school.
     *
     * @return The tuition fee for the school.
     */
    public double getTuition() {
        return tuition;
    }

    /**
     * Set the tuition fee for the school.
     *
     * @param tuition The tuition fee for the school to be set.
     */
    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    /**
     * Get the grade level of the school, e.g., Elementary, Secondary,
     * Post-Secondary.
     *
     * @return The grade level of the school.
     */
    public String getSchoolGrade() {
        return schoolGrade;
    }

    /**
     * Set the grade level of the school, e.g., Elementary, Secondary,
     * Post-Secondary.
     *
     * @param schoolGrade The grade level of the school to be set.
     */
    public void setSchoolGrade(String schoolGrade) {
        this.schoolGrade = schoolGrade;
    }

    /**
     * Check if the school offers the International Baccalaureate (IB) program.
     *
     * @return True if the school offers the IB program, false otherwise.
     */
    public boolean hasIB() {
        return hasIB;
    }

    /**
     * Set whether the school offers the International Baccalaureate (IB)
     * program.
     *
     * @param hasIB True if the school offers the IB program, false otherwise.
     */
    public void setHasIB(boolean hasIB) {
        this.hasIB = hasIB;
    }

    /**
     * Check if the school offers a gifted program.
     *
     * @return True if the school offers a gifted program, false otherwise.
     */
    public boolean hasGifted() {
        return hasGifted;
    }

    /**
     * Set whether the school offers a gifted program.
     *
     * @param hasGifted True if the school offers a gifted program, false
     * otherwise.
     */
    public void setHasGifted(boolean hasGifted) {
        this.hasGifted = hasGifted;
    }

    /**
     * Check if the school offers French language instruction.
     *
     * @return True if the school offers French, false otherwise.
     */
    public boolean hasFrench() {
        return hasFrench;
    }

    /**
     * Set whether the school offers French language instruction.
     *
     * @param hasFrench True if the school offers French, false otherwise.
     */
    public void setHasFrench(boolean hasFrench) {
        this.hasFrench = hasFrench;
    }
}
