package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<String> id();

  Optional<ProdCharacteristic> physicalCharacteristics();

  Optional<List<CodeableConcept>> otherCharacteristics();

  Quantity quantity();

  Optional<List<Reference>> device();

  Optional<List<Reference>> manufacturer();

  Optional<List<CodeableConcept>> alternateMaterial();

  Optional<List<Extension>> extension();

  CodeableConcept type();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> material();

  Optional<List<MedicinalProductPackaged_PackageItem>> packageItem();

  Optional<List<ProductShelfLife>> shelfLifeStorage();

  Optional<List<Reference>> manufacturedItem();

  static ImmutableMedicinalProductPackaged_PackageItem.QuantityBuildStage builder() {
    return ImmutableMedicinalProductPackaged_PackageItem.builder();
  }
}
