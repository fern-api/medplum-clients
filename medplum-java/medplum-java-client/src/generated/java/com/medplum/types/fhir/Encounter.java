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
  Optional<List<ResourceList>> contained();

  String resourceType();

  @JsonProperty("class")
  Coding _class();

  Optional<List<Encounter_ClassHistory>> classHistory();

  Optional<List<CodeableConcept>> type();

  Optional<Narrative> text();

  Optional<List<Reference>> appointment();

  Optional<List<Reference>> reasonReference();

  Optional<Id> id();

  Optional<List<Reference>> episodeOfCare();

  Optional<CodeableConcept> serviceType();

  Optional<Duration> length();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<Encounter_Location>> location();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> basedOn();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<CodeableConcept> priority();

  Optional<Reference> partOf();

  Optional<EncounterStatus> status();

  Optional<List<Encounter_Participant>> participant();

  Optional<List<Encounter_Diagnosis>> diagnosis();

  Optional<List<Reference>> account();

  Optional<Meta> meta();

  Optional<Reference> serviceProvider();

  Optional<Period> period();

  Optional<Reference> subject();

  Optional<Encounter_Hospitalization> hospitalization();

  Optional<List<Encounter_StatusHistory>> statusHistory();

  Optional<List<Identifier>> identifier();

  static ImmutableEncounter.ResourceTypeBuildStage builder() {
    return ImmutableEncounter.builder();
  }
}
