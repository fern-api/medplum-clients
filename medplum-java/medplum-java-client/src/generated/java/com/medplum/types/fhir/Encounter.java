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
  Optional<Period> period();

  Optional<Reference> subject();

  Optional<List<Reference>> account();

  Optional<Reference> serviceProvider();

  Optional<List<Encounter_ClassHistory>> classHistory();

  Optional<Meta> meta();

  Optional<List<Encounter_StatusHistory>> statusHistory();

  Optional<List<Reference>> appointment();

  Optional<List<Reference>> basedOn();

  Optional<EncounterStatus> status();

  Optional<Narrative> text();

  Optional<CodeableConcept> priority();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Encounter_Location>> location();

  Optional<List<Reference>> reasonReference();

  String resourceType();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<Encounter_Hospitalization> hospitalization();

  @JsonProperty("class")
  Coding _class();

  Optional<List<Encounter_Participant>> participant();

  Optional<Reference> partOf();

  Optional<List<CodeableConcept>> type();

  Optional<Duration> length();

  Optional<CodeableConcept> serviceType();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> episodeOfCare();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Encounter_Diagnosis>> diagnosis();

  Optional<Code> language();

  static ImmutableEncounter.ResourceTypeBuildStage builder() {
    return ImmutableEncounter.builder();
  }
}
