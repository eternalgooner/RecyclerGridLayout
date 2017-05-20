package david.com.recyclergirdlayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by David on 20-May-17.
 */

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberAdapterViewHolder>{

    private int numItems;
    private String[] numberList;

    public NumberAdapter(String[] numbers){
        numItems = numbers.length;
        numberList = numbers;
    }


    @Override
    public NumberAdapter.NumberAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForListItem, parent, false);

        //int height = parent.getMeasuredHeight() / 4;
        //view.setMinimumHeight(height);
        return new NumberAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NumberAdapter.NumberAdapterViewHolder holder, int position) {
        holder.txtNumber.setText(numberList[position]);
    }

    @Override
    public int getItemCount() {
        return numItems;
    }

    public class NumberAdapterViewHolder extends RecyclerView.ViewHolder{

        TextView txtNumber;
        //FrameLayout item;

        public NumberAdapterViewHolder(View itemView) {
            super(itemView);
            //item = (FrameLayout) itemView.findViewById(R.id.gv_item_view); //check if rv_item...works also
            txtNumber = (TextView) itemView.findViewById(R.id.txt_number_text);
        }
    }
}
