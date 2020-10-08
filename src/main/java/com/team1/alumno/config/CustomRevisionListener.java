package com.team1.alumno.config;

import com.team1.alumno.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity){
        final Revision revision = (Revision) revisionEntity;
    }
}
