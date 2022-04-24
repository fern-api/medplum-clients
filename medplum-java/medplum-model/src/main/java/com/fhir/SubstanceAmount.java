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
    as = ImmutableSubstanceAmount.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceAmount {
  Optional<CodeableConcept> amountType();

  Optional<String> amountText();

  Optional<SubstanceAmount_ReferenceRange> referenceRange();

  Optional<String> amountString();

  Optional<Quantity> amountQuantity();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> amountRange();

  static ImmutableSubstanceAmount.Builder builder() {
    return ImmutableSubstanceAmount.builder();
  }
}
