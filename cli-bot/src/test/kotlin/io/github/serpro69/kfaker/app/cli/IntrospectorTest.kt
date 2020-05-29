package io.github.serpro69.kfaker.app.cli

import io.github.serpro69.kfaker.Faker
import io.github.serpro69.kfaker.provider.Address
import io.github.serpro69.kfaker.provider.Dota
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder

class IntrospectorTest : DescribeSpec() {
    private val faker = Faker()

    init {
        describe("Introspector class") {
            val introspector = Introspector(faker)

            context("list all Faker providers") {
                val providers = introspector.providers
                    .map { it.returnType }
                    .map { it.simpleName }

                it("should contain all providers") {
                    val expectedProviders = listOf(
                        "Address",
                        "Ancient",
                        "Animal",
                        "App",
                        "Appliance",
                        "AquaTeenHungerForce",
                        "Artist",
                        "BackToTheFuture",
                        "Bank",
                        "Basketball",
                        "Beer",
                        "BojackHoreseman",
                        "Book",
                        "BossaNova",
                        "BreakingBad",
                        "Buffy",
                        "Business",
                        "Cannabis",
                        "Cat",
                        "Chiquito",
                        "ChuckNorris",
                        "Code",
                        "Coffee",
                        "Coin",
                        "Color",
                        "Commerce",
                        "Community",
                        "Company",
                        "Computer",
                        "Construction",
                        "Cosmere",
                        "CryptoCoin",
                        "CultureSeries",
                        "Currency",
                        "DcComics",
                        "Demographic",
                        "Dessert",
                        "Device",
                        "Dog",
                        "Dota",
                        "DrWho",
                        "DragonBall",
                        "DumbAndDumber",
                        "Dune",
                        "ESport",
                        "Educator",
                        "ElderScrolls",
                        "ElectricalComponents",
                        "Fallout",
                        "FamilyGuy",
                        "File",
                        "Food",
                        "Football",
                        "FreshPriceOfBelAir",
                        "Friends",
                        "FunnyName",
                        "Game",
                        "GameOfThrones",
                        "Gender",
                        "GhostBusters",
                        "GratefulDead",
                        "GreekPhilosophers",
                        "Hacker",
                        "HalfLife",
                        "HarryPotter",
                        "Heroes",
                        "HeroesOfTheStorm",
                        "HeyArnold",
                        "Hipster",
                        "HitchhikersGuideToTheGalaxy",
                        "Hobbit",
                        "Horse",
                        "House",
                        "HowIMetYourMother",
                        "IdNumber",
                        "IndustrySegments",
                        "Internet",
                        "Job",
                        "KPop",
                        "LeagueOfLegends",
                        "Lebowski",
                        "LordOfTheRings",
                        "Lorem",
                        "Lovecraft",
                        "Markdown",
                        "Marketing",
                        "Measurement",
                        "MichaelScott",
                        "Military",
                        "Movie",
                        "Music",
                        "Myst",
                        "Name",
                        "Nation",
                        "NatoPhoneticAlphabet",
                        "NewGirl",
                        "OnePiece",
                        "Opera",
                        "Overwatch",
                        "ParksAndRec",
                        "Phish",
                        "PhoneNumber",
                        "Pokemon",
                        "PrincessBride",
                        "ProgrammingLanguage",
                        "Quote",
                        "Rajnikanth",
                        "Relationship",
                        "Restaurant",
                        "RickAndMorty",
                        "RockBand",
                        "Rupaul",
                        "Science",
                        "Seinfeld",
                        "Separator",
                        "Shakespeare",
                        "SiliconValley",
                        "Simpsons",
                        "SlackEmoji",
                        "SonicTheHedgehog",
                        "SouthPark",
                        "Space",
                        "StarTrek",
                        "StarWars",
                        "Stargate",
                        "StrangerThings",
                        "Stripe",
                        "Subscription",
                        "SuperSmashBros",
                        "Superhero",
                        "SwordArtOnline",
                        "Team",
                        "TheExpanse",
                        "TheITCrowd",
                        "TheThickOfIt",
                        "TwinPeaks",
                        "UmphreysMcgee",
                        "University",
                        "VForVendetta",
                        "Vehicle",
                        "VentureBros",
                        "Verbs",
                        "Witcher",
                        "WorldCup",
                        "WorldOfWarcraft",
                        "Yoda",
                        "Zelda"
                    )
                    providers shouldContainExactlyInAnyOrder expectedProviders
                }
            }

            context("list available functions for each provider") {
                val providerFunctions = introspector.providerFunctions

                it("should contain all providers") {
                    val providers = providerFunctions.map { it.key.name }
                    val expectedProviders = listOf(
                        "getAddress",
                        "getAncient",
                        "getAnimal",
                        "getApp",
                        "getAppliance",
                        "getAquaTeenHungerForce",
                        "getArtist",
                        "getBackToTheFuture",
                        "getBank",
                        "getBasketball",
                        "getBeer",
                        "getBojackHoreseman",
                        "getBook",
                        "getBossaNova",
                        "getBreakingBad",
                        "getBuffy",
                        "getBusiness",
                        "getCannabis",
                        "getCat",
                        "getChiquito",
                        "getChuckNorris",
                        "getCode",
                        "getCoffee",
                        "getCoin",
                        "getColor",
                        "getCommerce",
                        "getCommunity",
                        "getCompany",
                        "getComputer",
                        "getConstruction",
                        "getCosmere",
                        "getCryptoCoin",
                        "getCultureSeries",
                        "getCurrency",
                        "getDcComics",
                        "getDemographic",
                        "getDessert",
                        "getDevice",
                        "getDog",
                        "getDota",
                        "getDrWho",
                        "getDragonBall",
                        "getDumbAndDumber",
                        "getDune",
                        "getESport",
                        "getEducator",
                        "getElderScrolls",
                        "getElectricalComponents",
                        "getFallout",
                        "getFamilyGuy",
                        "getFile",
                        "getFood",
                        "getFootball",
                        "getFreshPriceOfBelAir",
                        "getFriends",
                        "getFunnyName",
                        "getGame",
                        "getGameOfThrones",
                        "getGender",
                        "getGhostBusters",
                        "getGratefulDead",
                        "getGreekPhilosophers",
                        "getHacker",
                        "getHalfLife",
                        "getHarryPotter",
                        "getHeroes",
                        "getHeroesOfTheStorm",
                        "getHeyArnold",
                        "getHipster",
                        "getHitchhikersGuideToTheGalaxy",
                        "getHobbit",
                        "getHorse",
                        "getHouse",
                        "getHowIMetYourMother",
                        "getIdNumber",
                        "getIndustrySegments",
                        "getInternet",
                        "getJob",
                        "getKPop",
                        "getLeagueOfLegends",
                        "getLebowski",
                        "getLordOfTheRings",
                        "getLorem",
                        "getLovecraft",
                        "getMarkdown",
                        "getMarketing",
                        "getMeasurement",
                        "getMichaelScott",
                        "getMilitary",
                        "getMovie",
                        "getMusic",
                        "getMyst",
                        "getName",
                        "getNation",
                        "getNatoPhoneticAlphabet",
                        "getNewGirl",
                        "getOnePiece",
                        "getOpera",
                        "getOverwatch",
                        "getParksAndRec",
                        "getPhish",
                        "getPhoneNumber",
                        "getPokemon",
                        "getPrincessBride",
                        "getProgrammingLanguage",
                        "getQuote",
                        "getRajnikanth",
                        "getRelationship",
                        "getRestaurant",
                        "getRickAndMorty",
                        "getRockBand",
                        "getRupaul",
                        "getScience",
                        "getSeinfeld",
                        "getSeparator",
                        "getShakespeare",
                        "getSiliconValley",
                        "getSimpsons",
                        "getSlackEmoji",
                        "getSonicTheHedgehog",
                        "getSouthPark",
                        "getSpace",
                        "getStarTrek",
                        "getStarWars",
                        "getStargate",
                        "getStrangerThings",
                        "getStripe",
                        "getSubscription",
                        "getSuperSmashBros",
                        "getSuperhero",
                        "getSwordArtOnline",
                        "getTeam",
                        "getTheExpanse",
                        "getTheITCrowd",
                        "getTheThickOfIt",
                        "getTwinPeaks",
                        "getUmphreysMcgee",
                        "getUniversity",
                        "getVForVendetta",
                        "getVehicle",
                        "getVentureBros",
                        "getVerbs",
                        "getWitcher",
                        "getWorldCup",
                        "getWorldOfWarcraft",
                        "getYoda",
                        "getZelda"
                    )

                    providers shouldContainExactlyInAnyOrder expectedProviders
                }

                it("should contain all functions of the provider") {
                    val addressFunctions = providerFunctions.entries.first {
                        it.key.returnType == Address::class.java
                    }.value.map { it.name }

                    val expectedFunctions = listOf(
                        "buildingNumber",
                        "city",
                        "cityWithState",
                        "community",
                        "country",
                        "countryByCode",
                        "countryByName",
                        "countryCode",
                        "countryCodeLong",
                        "defaultCountry",
                        "fullAddress",
                        "mailbox",
                        "postcode",
                        "postcodeByState",
                        "secondaryAddress",
                        "state",
                        "stateAbbr",
                        "streetAddress",
                        "streetName",
                        "timeZone"
                    )

                    addressFunctions shouldContainExactlyInAnyOrder expectedFunctions
                }

                it("should not contain deprecated functions") {
                    val addressFunctions = providerFunctions.entries.first {
                        it.key.returnType == Dota::class.java
                    }.value.map { it.name }

                    val expectedFunctions = listOf("hero", "item", "player", "team")

                    addressFunctions shouldContainExactlyInAnyOrder expectedFunctions
                }
            }
        }
    }
}