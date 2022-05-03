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
  CodeableConcept type();

  Optional<List<Reference>> manufacturer();

  Optional<List<ProductShelfLife>> shelfLifeStorage();

  Quantity quantity();

  Optional<List<MedicinalProductPackaged_PackageItem>> packageItem();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> device();

  Optional<ProdCharacteristic> physicalCharacteristics();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> otherCharacteristics();

  Optional<String> id();

  Optional<List<CodeableConcept>> material();

  Optional<List<CodeableConcept>> alternateMaterial();

  Optional<List<Reference>> manufacturedItem();

  static ImmutableMedicinalProductPackaged_PackageItem.TypeBuildStage builder() {
    return ImmutableMedicinalProductPackaged_PackageItem.builder();
  }
}
