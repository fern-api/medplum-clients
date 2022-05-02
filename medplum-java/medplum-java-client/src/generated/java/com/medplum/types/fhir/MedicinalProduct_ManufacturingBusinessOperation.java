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
    as = ImmutableMedicinalProduct_ManufacturingBusinessOperation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProduct_ManufacturingBusinessOperation {
  Optional<Reference> regulator();

  Optional<CodeableConcept> confidentialityIndicator();

  Optional<List<Reference>> manufacturer();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> operationType();

  Optional<DateTime> effectiveDate();

  Optional<List<Extension>> extension();

  Optional<Identifier> authorisationReferenceNumber();

  static ImmutableMedicinalProduct_ManufacturingBusinessOperation.Builder builder() {
    return ImmutableMedicinalProduct_ManufacturingBusinessOperation.builder();
  }
}
