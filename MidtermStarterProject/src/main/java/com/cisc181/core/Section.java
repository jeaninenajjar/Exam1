package com.cisc181.core;


import java.util.UUID;

public class Section extends Semester {

	// Section has the following attributes: CourseID (UUID), SemesterID (UUID),
	// SectionID (UUID), RoomID (int).

	private UUID SectionID;
	private int RoomID;

	public Section (){}
	public Section(UUID courseID, UUID SemesterID, UUID SectionID, int RoomID) {
		super();
       this.RoomID = RoomID;
       this.SectionID = SectionID;}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

}
