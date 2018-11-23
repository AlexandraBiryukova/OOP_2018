package sis3.Objects;

import java.io.Serializable;
import java.io.*;

public class CourseFile implements Serializable,Comparable {
    private File file;
    public CourseFile(){
    }
    public CourseFile(File f){
        file=f;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    public int hashcode() {
        return super.hashCode();
    }


    @Override
    public String toString() {
        return file.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CourseFile){
            CourseFile f=(CourseFile)obj;
            if(f.file.toString().equals(this.file.toString()))
                return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
    if(o instanceof CourseFile) {
        CourseFile c=(CourseFile)o;
        return file.compareTo(c.file);
    }
    return -1;
    }
}
