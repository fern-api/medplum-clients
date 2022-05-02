package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Reference>> episodeOfCare();

  Optional<List<Reference>> reasonReference();

  Optional<Meta> meta();

  Optional<Duration> length();

  Optional<CodeableConcept> serviceType();

  Optional<EncounterStatus> status();

  Optional<CodeableConcept> priority();

  Optional<Reference> subject();

  Optional<List<Encounter_Location>> location();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> type();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> appointment();

  Optional<Encounter_Hospitalization> hospitalization();

  Optional<List<Reference>> basedOn();

  Optional<Reference> serviceProvider();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<Id> id();

  Optional<Period> period();

  Optional<List<Encounter_Participant>> participant();

  Optional<List<Extension>> extension();

  Optional<List<Encounter_StatusHistory>> statusHistory();

  Optional<List<Encounter_ClassHistory>> classHistory();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Reference> partOf();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> account();

  Optional<List<Encounter_Diagnosis>> diagnosis();

  @JsonProperty("class")
  Coding _class();

  static ImmutableEncounter.ResourceTypeBuildStage builder() {
    return ImmutableEncounter.builder();
  }
}
