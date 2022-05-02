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
    as = ImmutableMedicinalProductManufactured.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductManufactured {
  Optional<CodeableConcept> unitOfPresentation();

  String resourceType();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Quantity quantity();

  Optional<List<Reference>> ingredient();

  Optional<List<Extension>> extension();

  CodeableConcept manufacturedDoseForm();

  Optional<Code> language();

  Optional<List<Reference>> manufacturer();

  Optional<ProdCharacteristic> physicalCharacteristics();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> otherCharacteristics();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  static ImmutableMedicinalProductManufactured.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductManufactured.builder();
  }
}
