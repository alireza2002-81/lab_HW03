import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<Music>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param music The file to be added.
     */
    public void addFile(Music music)
    {
        files.add(music);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)==false){
            System.out.println("Your index is out of range");
            return;
        }
        System.out.println(files.get(index));
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        Iterator<Music> filesIT = files.iterator();
        while(filesIT.hasNext()){
            System.out.println(filesIT.next());
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)==false){
            System.out.println("Your index is out of range");
            return;
        }
        files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index)==false){
            System.out.println("Your index is out of range");
            return;
        }
        player.startPlaying(files.get(index));
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        if(index<files.size()&&index>=0){
            return true;
        }else{
            return false;
        }
       
    }

    /**
     * search method
     * @param nameLike
     */
    private void search(String nameLike){
        for (int i = 0;i<files.size();i++){
            if(files.get(i).getAddress().contains(nameLike)||files.get(i).getSinger().contains(nameLike)){
                System.out.println();
            }
        }
    }
}