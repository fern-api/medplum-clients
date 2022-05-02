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
  Optional<CodeableConcept> amountType();

  Optional<Quantity> amountQuantity();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> amountRange();

  Optional<String> amountString();

  Optional<List<Extension>> extension();

  Optional<String> amountText();

  Optional<String> id();

  Optional<SubstanceAmount_ReferenceRange> referenceRange();

  static ImmutableSubstanceAmount.Builder builder() {
    return ImmutableSubstanceAmount.builder();
  }
}
