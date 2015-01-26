package org.mattmoyer.funfacts;

import java.util.Random;

/**
 * Created by Matt on 1/23/2015.
 */
public class FactBook {

    // member variables (properties about an object)
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Around 1495 Leonardo daVinci sketched plans for a humanoid robot.",
            "The longest time between two twins being born is 87 days.",
            "The world’s deepest postbox is in Susami Bay in Japan. It’s 10 metres underwater.",
            "The oldest condoms ever found date back to the 1640s (they were found in a cesspit at " +
                    "Dudley Castle), and were made from animal and fish intestines.",
            "In 1923, jockey Frank Hayes won a race at Belmont Park in New York despite being dead — " +
                    "he suffered a heart attack mid-race, but his body stayed in the saddle until his " +
                    "horse crossed the line for a 20–1 outsider victory.",
            "Everyone has a unique tongue print, just like fingerprints.",
            "Most Muppets are left-handed. (Because most Muppeteers are right-handed, so they operate " +
                    "the head with their favoured hand.)",
            "Female kangaroos have three vaginas.",
            "It costs the U.S. Mint almost twice as much to mint each penny and nickel as the coins " +
                    "are actually worth. Taxpayers lost over $100 million in 2013 just through the " +
                    "coins being made.",
            "Light doesn’t necessarily travel at the speed of light. The slowest we’ve ever recorded " +
                    "light moving at is 38 mph.",
            "Casu marzu is a Sardinian cheese that contains live maggots.",
            "The loneliest creature on Earth is a whale who has been calling out for a mate for over " +
                    "two decades — but whose high-pitched voice is so different to other whales that " +
                    "they never respond.",
            "The spikes on the end of a stegosaurus’ tail are known among paleontologists as the " +
                    "“thagomizer” — a term coined by cartoonist Gary Larson in a 1982 Far Side drawing.",
            "During World War II, the crew of the British submarine HMS Trident kept a fully grown " +
                    "reindeer called Pollyanna aboard their vessel for six weeks (it was a gift from " +
                    "the Russians).",
            "The northern leopard frog swallows its prey using its eyes — it uses them to help push " +
                    "food down its throat by retracting them into its head.",
            "The first man to urinate on the moon was Buzz Aldrin, shortly after stepping onto the " +
                    "lunar surface.",
            "Some fruit flies are genetically resistant to getting drunk — but only if they have an " +
                    "inactive version of a gene scientists have named “happyhour”.",
            "Experiments show that male rhesus macaque monkeys will pay to look at pictures of female " +
                    "rhesus macaques’ bottoms.",
            "In 1567, the man said to have the longest beard in the world died after he tripped over " +
                    "his beard running away from a fire.",
            "The Dance Fever of 1518 was a month-long plague of inexplicable dancing in Strasbourg, " +
                    "in which hundreds of people danced for about a month for no apparent reason. " +
                    "Several of them danced themselves to death.",
            "Vladimir Nabokov nearly invented the smiley.",
            "In 1993, San Francisco held a referendum over whether a police officer called Bob Geary " +
                    "was allowed to patrol while carrying a ventriloquist’s dummy called Brendan O’Smarty. He was.",
            "Sigurd the Mighty, a ninth-century Norse earl of Orkney, was killed by an enemy he had " +
                    "beheaded several hours earlier. He’d tied the man’s head to his horse’s saddle, " +
                    "but while riding home one of its protruding teeth grazed his leg. He died from the infection.",
            "The Dutch village of Giethoorn has no roads; its buildings are connected entirely by " +
                    "canals and footbridges.",
            "A family of people with blue skin lived in Kentucky for many generations. The Fulgates " +
                    "of Troublesome Creek are thought to have gained their blue skin through " +
                    "combination of inbreeding and a rare genetic condition known as methemoglobinemia.",
            "Powerful earthquakes can permanently shorten the length of Earth’s day, by moving the " +
                    "spin of the Earth’s axis. The 2011 Japan earthquake knocked 1.8 microseconds " +
                    "off our days. The 2004 Sumatra quake cost us around 6.8 microseconds.",
            "The first American film to show a toilet being flushed on screen was Alfred Hitchcock’s Psycho.",
            "Melting glaciers and icebergs make a distinctive fizzing noise known as “bergy seltzer”.",
            "There is a glacier called “Blood Falls” in Antarctica that regularly pours out red liquid, " +
                    "making it look like the ice is bleeding. (It’s actually oxidised salty water.)",
            "In 2008 scientists discovered a new species of bacteria that lives in hairspray.",
            "The top of the Eiffel Tower leans away from the sun, as the metal facing the sun heats " +
                    "up and expands. It can move as much as 7 inches.",
            "Lt. Col. “Mad” Jack Churchill was only British soldier in WWII known to have killed an " +
                    "enemy soldier with a longbow. “Mad Jack” insisted on going into battle armed with " +
                    "both a medieval bow and a claymore sword.",
            "A U.S. park ranger named Roy C. Sullivan held the record for being struck by lightning " +
                    "the most times, having been struck — and surviving — seven times between 1942 and 1977. He died of a self-inflicted gunshot in 1983.",
            "The longest musical performance in history is currently taking place in the church of " +
                    "St. Burchardi in Halberstadt, Germany. The performance of John Cage’s “Organ²/ASLSP " +
                    "(As Slow As Possible)” started on Sept. 5, 2001, and is set to finish in 2640. " +
                    "The last time the note changed was October 2013; the next change isn’t due until 2020.",
            "There’s an opera house on the U.S.–Canada border where the stage is in one country and " +
                    "half the audience is in another.",
            "The tiny parasite Toxoplasma gondii can only breed sexually when in the guts of a cat. " +
                    "To this end, when it infects rats, it changes their behaviour to make them less scared of cats.",
            "The katzenklavier (“cat piano”) was a musical instrument made out of cats. Designed by " +
                    "17th-century German scholar Athanasius Kircher, it consisted of a row of caged " +
                    "cats with different voice pitches, who could be “played” by a keyboardist driving " +
                    "nails into their tails.",
            "There is a single mega-colony of ants that spans three continents, covering much of Europe, " +
                    "the west coast of the U.S., and the west coast of Japan.",
            "The largest snowflake ever recorded reportedly measured 15 inches across.",
            "An epidemic of laughing that lasted almost a year broke out in Tanganyika (now Tanzania) " +
                    "in 1962. Several thousand people were affected, across several villages. It " +
                    "forced a school to close.",
            "The Romans used to clean and whiten their teeth with urine.",
            "There are around 60,000 miles of blood vessels in the human body. If you took them all " +
                    "out and laid them end to end, they’d stretch around the world more than twice."
    };

    // Method (abilities: things the object can do)
    public String getFact() {
        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // construct a new Random generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
