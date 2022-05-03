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
  Optional<Ratio> amount();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> form();

  Optional<Code> status();

  Optional<Medication_Batch> batch();

  Optional<List<ResourceList>> contained();

  Optional<Reference> manufacturer();

  String resourceType();

  Optional<List<Medication_Ingredient>> ingredient();

  Optional<CodeableConcept> code();

  Optional<Id> id();

  Optional<Meta> meta();

  static ImmutableMedication.ResourceTypeBuildStage builder() {
    return ImmutableMedication.builder();
  }
}
