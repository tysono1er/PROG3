package epicerie;

import java.util.List;
import java.util.Map;

//TODO methode toString incroyable

public class Section
{
	private SectionType typeSection;
	private List<SousSection> listeSousSection = null;

	public Section(SectionType typeSection)
	{
		super();
		this.typeSection = typeSection;
	}

	public void creerSections()
	{
		new Section(SectionType.ALLEE);
		new Section(SectionType.BOUCHER);
		new Section(SectionType.BOULANGERIE);
		new Section(SectionType.FRIGIDAIRE);
		new Section(SectionType.VERGER);
	}
	
	public SectionType getTypeSection()
	{
		return typeSection;
	}

	public void setTypeSection(SectionType typeSection)
	{
		this.typeSection = typeSection;
	}

	public List<SousSection> getListeSousSection()
	{
		return listeSousSection;
	}

	public void setListeSousSection(List<SousSection> listeSousSection)
	{
		this.listeSousSection = listeSousSection;
	}
}