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
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Identifier> authorisationReferenceNumber();

  Optional<CodeableConcept> confidentialityIndicator();

  Optional<CodeableConcept> operationType();

  Optional<DateTime> effectiveDate();

  Optional<List<Reference>> manufacturer();

  Optional<Reference> regulator();

  static ImmutableMedicinalProduct_ManufacturingBusinessOperation.Builder builder() {
    return ImmutableMedicinalProduct_ManufacturingBusinessOperation.builder();
  }
}
