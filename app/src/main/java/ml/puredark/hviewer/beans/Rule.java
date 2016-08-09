package ml.puredark.hviewer.beans;

public class Rule{
	public Selector item, title, uploader, cover, category, datetime, rating, tags, pictures;

    public Rule(){
    }

	public Rule(Selector item, Selector title, Selector uploader, Selector cover, Selector category,
				Selector datetime, Selector rating, Selector tags, Selector pictures){
		this.item = item;
		this.title = title;
		this.uploader = uploader;
		this.cover = cover;
		this.category = category;
		this.datetime = datetime;
		this.rating = rating;
		this.tags = tags;
		this.pictures = pictures;
	}

}