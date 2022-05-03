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
    as = ImmutableMedicinalProductPackaged_PackageItem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPackaged_PackageItem {
  Optional<List<ProductShelfLife>> shelfLifeStorage();

  Optional<ProdCharacteristic> physicalCharacteristics();

  Quantity quantity();

  Optional<List<Reference>> manufacturedItem();

  Optional<List<CodeableConcept>> alternateMaterial();

  Optional<List<CodeableConcept>> material();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> device();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> manufacturer();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> otherCharacteristics();

  Optional<List<MedicinalProductPackaged_PackageItem>> packageItem();

  Optional<String> id();

  CodeableConcept type();

  static ImmutableMedicinalProductPackaged_PackageItem.QuantityBuildStage builder() {
    return ImmutableMedicinalProductPackaged_PackageItem.builder();
  }
}
