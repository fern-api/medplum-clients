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
    as = ImmutableSubstanceAmount.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceAmount {
  Optional<String> amountString();

  Optional<CodeableConcept> amountType();

  Optional<String> amountText();

  Optional<Range> amountRange();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<SubstanceAmount_ReferenceRange> referenceRange();

  Optional<String> id();

  Optional<Quantity> amountQuantity();

  static ImmutableSubstanceAmount.Builder builder() {
    return ImmutableSubstanceAmount.builder();
  }
}
