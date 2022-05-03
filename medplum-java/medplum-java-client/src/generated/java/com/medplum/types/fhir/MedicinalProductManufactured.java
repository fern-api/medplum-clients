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
  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> otherCharacteristics();

  Optional<Meta> meta();

  Optional<CodeableConcept> unitOfPresentation();

  Optional<Narrative> text();

  CodeableConcept manufacturedDoseForm();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<ProdCharacteristic> physicalCharacteristics();

  Optional<List<Reference>> ingredient();

  String resourceType();

  Quantity quantity();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> manufacturer();

  static ImmutableMedicinalProductManufactured.ManufacturedDoseFormBuildStage builder() {
    return ImmutableMedicinalProductManufactured.builder();
  }
}
