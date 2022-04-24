package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableEncounter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Encounter {
  Optional<CodeableConcept> priority();

  Optional<List<CodeableConcept>> type();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Reference> subject();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> episodeOfCare();

  Optional<Meta> meta();

  Optional<code> language();

  Optional<List<ResourceList>> contained();

  Optional<Duration> length();

  Optional<EncounterStatus> status();

  Optional<CodeableConcept> serviceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> reasonReference();

  Optional<List<Identifier>> identifier();

  Optional<Period> period();

  Optional<id> id();

  Optional<uri> implicitRules();

  Optional<List<Encounter_StatusHistory>> statusHistory();

  @JsonProperty("class")
  Coding _class();

  Optional<Narrative> text();

  Optional<List<Reference>> account();

  Optional<List<Encounter_ClassHistory>> classHistory();

  Optional<List<Extension>> extension();

  Optional<List<Encounter_Location>> location();

  Optional<List<Encounter_Diagnosis>> diagnosis();

  String resourceType();

  Optional<Encounter_Hospitalization> hospitalization();

  Optional<Reference> serviceProvider();

  Optional<Reference> partOf();

  Optional<List<Reference>> appointment();

  Optional<List<Encounter_Participant>> participant();

  static ImmutableEncounter._classBuildStage builder() {
    return ImmutableEncounter.builder();
  }
}
