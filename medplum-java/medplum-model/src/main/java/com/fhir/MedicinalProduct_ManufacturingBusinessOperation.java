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
    as = ImmutableMedicinalProduct_ManufacturingBusinessOperation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProduct_ManufacturingBusinessOperation {
  Optional<List<Extension>> extension();

  Optional<Reference> regulator();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> manufacturer();

  Optional<CodeableConcept> operationType();

  Optional<String> id();

  Optional<dateTime> effectiveDate();

  Optional<CodeableConcept> confidentialityIndicator();

  Optional<Identifier> authorisationReferenceNumber();

  static ImmutableMedicinalProduct_ManufacturingBusinessOperation.Builder builder() {
    return ImmutableMedicinalProduct_ManufacturingBusinessOperation.builder();
  }
}
