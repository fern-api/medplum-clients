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
  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<List<CodeableConcept>> otherCharacteristics();

  Optional<List<Reference>> manufacturer();

  Optional<Uri> implicitRules();

  CodeableConcept manufacturedDoseForm();

  Optional<ProdCharacteristic> physicalCharacteristics();

  Optional<List<Reference>> ingredient();

  Optional<List<Extension>> modifierExtension();

  Quantity quantity();

  Optional<Meta> meta();

  Optional<CodeableConcept> unitOfPresentation();

  Optional<Code> language();

  static ImmutableMedicinalProductManufactured.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductManufactured.builder();
  }
}
