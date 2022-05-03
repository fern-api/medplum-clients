package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMedication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Medication {
  Optional<Narrative> text();

  Optional<Id> id();

  Optional<Reference> manufacturer();

  Optional<List<Medication_Ingredient>> ingredient();

  Optional<Ratio> amount();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> code();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> form();

  Optional<Meta> meta();

  String resourceType();

  Optional<Code> status();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<Medication_Batch> batch();

  static ImmutableMedication.ResourceTypeBuildStage builder() {
    return ImmutableMedication.builder();
  }
}
