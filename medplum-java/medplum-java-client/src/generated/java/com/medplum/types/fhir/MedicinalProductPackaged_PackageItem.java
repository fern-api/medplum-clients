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
  Optional<ProdCharacteristic> physicalCharacteristics();

  CodeableConcept type();

  Optional<List<CodeableConcept>> otherCharacteristics();

  Optional<List<Reference>> manufacturer();

  Optional<String> id();

  Optional<List<MedicinalProductPackaged_PackageItem>> packageItem();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> alternateMaterial();

  Optional<List<ProductShelfLife>> shelfLifeStorage();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> device();

  Optional<List<Reference>> manufacturedItem();

  Optional<List<Identifier>> identifier();

  Quantity quantity();

  Optional<List<CodeableConcept>> material();

  static ImmutableMedicinalProductPackaged_PackageItem.TypeBuildStage builder() {
    return ImmutableMedicinalProductPackaged_PackageItem.builder();
  }
}
