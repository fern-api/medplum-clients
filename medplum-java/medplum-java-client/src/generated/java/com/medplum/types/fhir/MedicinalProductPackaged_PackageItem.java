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
  Optional<List<Extension>> extension();

  CodeableConcept type();

  Optional<ProdCharacteristic> physicalCharacteristics();

  Quantity quantity();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> manufacturedItem();

  Optional<List<Reference>> device();

  Optional<List<CodeableConcept>> alternateMaterial();

  Optional<List<CodeableConcept>> otherCharacteristics();

  Optional<List<CodeableConcept>> material();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> manufacturer();

  Optional<List<ProductShelfLife>> shelfLifeStorage();

  Optional<String> id();

  Optional<List<MedicinalProductPackaged_PackageItem>> packageItem();

  static ImmutableMedicinalProductPackaged_PackageItem.TypeBuildStage builder() {
    return ImmutableMedicinalProductPackaged_PackageItem.builder();
  }
}
