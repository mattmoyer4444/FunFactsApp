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
                    "the most times, having been struck — and surviving — seven times between 1942 and 1977. " +
                    "He died of a self-inflicted gunshot in 1983.",
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
                    "out and laid them end to end, they’d stretch around the world more than twice.",
            "Sea otters hold hands when they sleep to keep from drifting apart.",
            "When you were born, you were, for a moment, the youngest person on earth.",
            "The elements that we are composed of were formed in the interiors of collapsing stars. We are all made of star dust.",
            "Cows have best friends.",
            "A prison in Washington pairs up “death row” shelter cats with select inmates as part " +
                    "of a rehabilitation program. It seems to be a pretty wonderful thing for both the inmates and the cats.",
            "Blind people smile even though they’ve never seen anyone else smile.",
            "Turtles can breathe through their butts.",
            "The Beatles used the word “love” 613 times in their songs.",
            "Squirrels plant thousands of new trees each year simply by forgetting where they put their acorns.",
            "Macaques in Japan use coins to buy vending machine snacks.",
            "A BBC News program broadcast in 1957 ended claiming that spaghetti grew on trees on a " +
                    "farm in Switzerland. Many viewers believed the report and called the BBC asking " +
                    "how to grow their own trees. Their response: 'Place a sprig of spaghetti in a " +
                    "tin of tomato sauce and hope for the best.'",
            "Norway knighted a penguin.",
            "In China, killing a Panda is punishable by death.",
            "Rats laugh when tickled.",
            "The voices of Mickey Mouse and Minnie Mouse got married in real life.",
            "Spiders can’t fly.",
            "Sweden has a rabbit show jumping competition called Kaninhoppning.",
            "Gentoo penguins propose to their lifemates with a pebble.",
            "Dolphins have names for each other.",
            "Kissing burns 2 calories a minute. Undressing burns 8.",
            "Puffins mate for life. They make their homes on cliff sides and even leave some separate room for their toilet.",
            "The Kingdom of Bhutan uses “Gross National Happiness” as an important national measurement.",
            "When playing with female puppies, male puppies will often let them win, even if they have a physical advantage.",
            "Pigs’ orgasms last for 30 minutes.",
            "A study measuring the effects of music found that cows produce more milk when listening to soothing music. " +
                    "They produce the most when listening to R.E.M’s \"Everybody Hurts\".",
            "There is a program that makes prison inmates responsible for training and raising seeing-eye dogs. " +
                    "Many reported that they felt like they were making amends for their past actions by working with the puppies.",
            "Google, the periodic table, the structure of our DNA, and “Yesterday” by the Beatles " +
                    "are all ideas that were conceived in dreams.",
            "There’s a superhero with a hearing aid called ‘Blue Ear’. He was created by Marvel Comics " +
                    "to encourage a little boy to wear his own!",
            "Good news is more likely to be shared through social media than bad news (wink wink, nudge nudge).",
            "Animals that lay eggs don't have belly buttons.",
            "Beavers can hold their breath for 45 minutes under water.",
            "Slugs have four noses.",
            "Camels have three eyelids.",
            "A honey bee can fly at 15mph.",
            "A queen bee can lay 800-1,500 eggs per day.",
            "A bee has five eyelids.",
            "The average speed of a housefly is 4.5 mph.",
            "Mosquitoes are attracted to people who just ate bananas.",
            "Flamingos turn pink from eating shrimp.",
            "Emus and kangaroos cannot walk backward.",
            "Cats have over 100 vocal chords.",
            "Camel's milk does not curdle.",
            "All porcupines float in water.",
            "The world's termites outweigh the world's humans about 10 to 1.",
            "A hummingbird weighs less than a penny.",
            "A jellyfish is approximately 95% water.",
            "Children tend to grow faster in the spring.",
            "Broccoli is the only vegetable that is also a flower.",
            "Almonds are part of the peach family.",
            "Alaska has the highest percentage of people who walk to work.",
            "The San Francisco cable cars are the only mobile national monument.",
            "The state of Maine has 62 lighthouses.",
            "The only food that does not spoil is honey.",
            "The Hawaiian alphabet only has 12 letters.",
            "A ball of glass will bounce higher than a ball of rubber.",
            "Chewing gum while peeling onions will prevent you from crying.",
            "On average a human will spend up to 2 weeks kissing in his/her lifetime.",
            "Fish have eyelids.",
            "There are about 1 million ants for every person in the world.",
            "Termites eat through wood two times faster when listening to rock music!",
            "If you keep a goldfish in a dark room it will eventually turn white.",
            "A snail breathes through its foot.",
            "Fish cough.",
            "An ant's sense of smell is stronger than a dog's.",
            "It is possible to lead a cow up stairs but not down.",
            "Shrimp can only swim backward.",
            "Frogs cannot swallow with their eyes open.",
            "A cat's lower jaw cannot move sideways.",
            "The bullfrog is the only animal that never sleeps.",
            "Elephants are capable of swimming 20 miles per day.",
            "Elephants are the only mammals that can't jump.",
            "Giraffes have no vocal chords.",
            "Cats can hear ultrasound.",
            "Despite its hump, a camel has a straight spine.",
            "Mosquitoes have 47 teeth.",
            "There are 63,360 inches in a mile.",
            "About 11% of the people in the world are left-handed.",
            "The average women consumes six pounds of lipstick in her lifetime.",
            "The average smell weighs 760 nanograms.",
            "A human brain weighs about three pounds.",
            "1/4 of the bones in your body are in your feet.",
            "You blink over 10,000,000 times a year.",
            "A sneeze travels out of your mouth at over 100 miles an hour.",
            "Brain waves can be used to power an electric train.",
            "The tongue is the fastest healing part of the body.",
            "Pigs can get sunburn.",
            "The lifespan of a taste bud is about ten days.",
            "The average human produces 10,000 gallons of saliva in a lifetime.",
            "Strawberries contain more vitamin C than oranges.",
            "A one-day weather forecast requires about 10 billion math calculations.",
            "Americans, on average, eat 18 acres of pizza a day.",
            "There are 18 different animal shapes in the animal cracker zoo.",
            "The longest one syllable word is \"screeched.\"",
            "No word in the English language rhymes with month.",
            "There is a town called \"Big Ugly\" in West Virginia.",
            "The average person uses 150 gallons of water per day for personal use.",
            "The average person spends 2 weeks over his/her lifetime waiting for a traffic light to change.",
            "You share your birthday with at least 9 million other people in the world.",
            "The average person makes 1,140 phone calls per year.",
            "The average person spends about 2 years on the phone in a lifetime.",
            "No piece of paper can be folded more than seven times.",
            "Alaska is the most eastern and western state in the U.S.",
            "There are 119 grooves on the edge of a quarter.",
            "About 18 percent of animal owners share their bed with their pet.",
            "Alaska has more caribou than people.",
            "August has the highest percentage of births.",
            " Googol is a number (1 followed by 100 zeros).",
            "Oysters can change from one gender to another and back again.",
            "The Mona Lisa has no eyebrows.",
            "Until the 19th century, solid blocks of tea were used as money in Siberia.",
            "A mile on the ocean and a mile on land are not the same distance.",
            "A ten gallon hat holds less than one gallon of liquid.",
            "The average raindrop falls at seven mph.",
            "There are more telephones than people in Washington, D.C.",
            "Fish can drown.",
            "A kangaroo can jump 30 feet.",
            "Lizards communicate by doing push-ups.",
            "Squids can have eyes the size of a volleyball.",
            "The average American will eat 35,000 cookies in his/her lifetime.",
            "A turkey can run at 20 mph.",
            "When the moon is directly overhead, you weigh slightly less.",
            "You burn about 20 calories per hour chewing gum.",
            "In a year, the average person walks four miles making his or her bed.",
            "About half of all Americans are on a diet on any given day.",
            "A one-minute kiss burns about 26 calories.",
            "Frowning burns more calories than smiling.",
            "There are more than 30,000 diets on public record.",
            "You will burn about 7% more calories walking on hard dirt than on pavement.",
            "You would weigh less on the top of a mountain than at sea level.",
            "You burn more calories sleeping than watching TV.",
            "Licking a stamp burns 10 calories.",
            "Smelling apples and/or bananas can help you lose weight.",
            "Frogs never drink.",
            "Only male turkeys gobble.",
            "At birth, a Dalmation is always pure white.",
            "The oldest known animal was a tortoise, which lived to be 152 years old.",
            "Bamboo makes up 99 percent of a panda's diet.",
            "The largest fish is the whale shark - it can be over 50 feet long and weigh two tons.",
            "The starfish is the only animal that can turn its stomach inside out.",
            "Honeybees are the only insects that create a form of food for humans.",
            "The hummingbird is the only bird that can fly backwards.",
            "The only continent without reptiles or snakes is Antarctica.",
            "The only bird that can swim and not fly is a penguin.",
            "A duck can't walk without bobbing its head.",
            "Beavers were once the size of bears.",
            "Seals sleep only one and a half minutes at a time.",
            "Pigeons have been trained by the U.S. Coast Guard to spot people lost at sea.",
            "A pigeon's feathers are heavier than its bones.",
            "A hummingbird's heart beats 1,400 times a minute.",
            "Dragonflies have six legs but can't walk.",
            "Dolphins can jump up to 20 feet in the air.",
            "Koala and humans are the only animals with unique fingerprints.",
            "Penguins have an organ above their eyes that converts seawater to fresh water.",
            "A crocodile cannot move its tongue.",
            "Honeybees navigate by using the sun as a compass.",
            "An ant can lift 50 times its own weight.",
            "A single coffee tree produces only about a pound of coffee beans per year.",
            "Strawberries are the only fruits whose seeds grow on the outside.",
            "The city of Los Angeles has about 3x more automobiles than people.",
            "Hawaii is the only U.S. state that grows coffee commercially.",
            "Hawaii is the only state with one school district.",
            "Holland is the only country with a national dog.",
            "The square dance is the official dance of the state of Washington.",
            "Hawaii is the only U.S. state never to report a temperature of zero degrees F or below.",
            "\"Q\" is the only letter in the alphabet not appearing in the name of any U.S. state.",
            "Texas is the only state that permits residents to cast absentee ballots from space.",
            "Lake Superior is the world's largest lake.",
            "The smallest county in America is New York County, better known as Manhattan.",
            "Panama is the only place in the world where you can see the sun rise on the Pacific and set on the Atlantic.",
            "The tallest man was 8 ft. 11 in.",
            "Theodore Roosevelt was the only president who was blind in one eye.",
            "The first sport to be filmed was boxing in 1894.",
            "The fastest served ball in tennis was clocked at 154 mph in 1963.",
            "In 1985, the fastest bicyclist was clocked at 154 mph.",
            "The speed limit in NYC was eight mph in 1895.",
            "Americans spend more than $630 million a year on golf balls.",
            "In 1926, the first outdoor mini-golf courses were built on rooftops in NYC.",
            "Swimming pools in the U.S. contain enough water to cover San Francisco.",
            "The first TV soap opera debuted in 1946.",
            "The first MTV video was \"Video Killed the Radio Star\" by the Buggles.",
            "The first TV show ever to be put into reruns was \"The Lone Ranger.\"",
            "The first TV network kids show in the U.S. was \"Captain Kangaroo.\"",
            "The temperature of the sun can reach up to 15 million degrees Fahrenheit.",
            "The first penny had the motto \"Mind your own business.\"",
            "The first vacuum was so large, it was brought to a house by horses.",
            "Your eye expands up to 45% when looking at something pleasing.",
            "Before mercury, brandy was used to fill thermometers.",
            "You'd have to play ping-pong for about 12 hours to lose one pound.",
            "One brow wrinkle is the result of 200,000 frowns.",
            "The first human-made object to break the sound barrier was a whip.",
            "In 1878, the first telephone book ever issued contained only 50 names.",
            "The most sensitive parts of the body are the mouth and the fingertips.",
            "The eye makes movements 50 times every second.",
            "Chinese is the most spoken language in the world.",
            "The world's biggest pyramid is not in Egypt, but in Mexico.",
            "In 1634, tulip bulbs were a form of currency in Holland.",
            "The first bike was called a hobbyhorse.",
            "The first sailing boats were built in Egypt.",
            "The first ballpoint pens were sold in 1945 for $12.00.",
            "The first VCR was made in 1956 and was the size of a piano.",
            "The first jukebox was located in San Francisco in 1899.",
            "A rainbow can only be seen in the morning or late afternoon.",
            "The Capitol building in Washington, D.C. has 365 steps to represent every day of the year.",
            "The most used letters in the English language are E, T, A, O, I and N.",
            "A male kangaroo is called a boomer.",
            "A female kangaroo is called a flyer.",
            "There are over 61,000 pizzerias in the U.S.",
            "Antarctica is the driest, coldest, windiest, and highest continent on earth.",
            "The Sahara Desert stretches farther than the distance from California to New York.",
            "Thailand means \"Land of the Free.\"",
            "Popcorn was invented by the American Indians.",
            "Jupiter spins so fast that there is a new sunrise nearly every 10 hours.",
            "The year that read the same upside down was 1961. That won't happen again until 6009.",
            "You don't have to be a lawyer to be a Supreme Court Justice.",
            "Eleven of the 50 U.S. states are named after an actual person.",
            "If you doubled one penny every day for 30 days, you would have $5,368,709.",
            "The first person crossed Niagara Falls by tightrope in 1859.",
            "The U.S. is the largest country named after a real person (Amerigo Vespucci).",
            "The largest cheesecake ever made weighed 57,508 lbs.",
            "The first country to use postcards was Austria.",
            "The only one-syllabled U.S. state is Maine."




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
