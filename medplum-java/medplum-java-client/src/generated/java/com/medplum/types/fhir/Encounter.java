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
  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> type();

  Optional<Code> language();

  Optional<Period> period();

  Optional<List<Reference>> basedOn();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<Encounter_Diagnosis>> diagnosis();

  Optional<List<Reference>> appointment();

  Optional<List<Encounter_Participant>> participant();

  Optional<List<Extension>> extension();

  Optional<Duration> length();

  Optional<List<Encounter_Location>> location();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Encounter_StatusHistory>> statusHistory();

  Optional<Reference> subject();

  Optional<Encounter_Hospitalization> hospitalization();

  Optional<EncounterStatus> status();

  Optional<List<Identifier>> identifier();

  @JsonProperty("class")
  Coding _class();

  Optional<CodeableConcept> priority();

  Optional<List<Reference>> reasonReference();

  Optional<Reference> partOf();

  Optional<Meta> meta();

  Optional<List<Encounter_ClassHistory>> classHistory();

  Optional<CodeableConcept> serviceType();

  Optional<List<Reference>> episodeOfCare();

  Optional<Reference> serviceProvider();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> account();

  Optional<Id> id();

  static ImmutableEncounter.ResourceTypeBuildStage builder() {
    return ImmutableEncounter.builder();
  }
}
