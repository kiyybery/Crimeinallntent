package criminalintent.android.bignerdranch.com.crimeinallntent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by zihua on 2015/10/2.
 */
public class Crime {

    private UUID mId;
    private  String mTilte;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }
    public String getmTilte() {
        return mTilte;
    }

    public void setmTilte(String mTilte) {
        this.mTilte = mTilte;
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    @Override
    public String toString() {
        return mTilte;
    }
}
