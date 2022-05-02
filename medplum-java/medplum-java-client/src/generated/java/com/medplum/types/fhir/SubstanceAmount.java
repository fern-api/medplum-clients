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
  Optional<List<Extension>> extension();

  Optional<Quantity> amountQuantity();

  Optional<String> amountText();

  Optional<SubstanceAmount_ReferenceRange> referenceRange();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> amountRange();

  Optional<String> id();

  Optional<String> amountString();

  Optional<CodeableConcept> amountType();

  static ImmutableSubstanceAmount.Builder builder() {
    return ImmutableSubstanceAmount.builder();
  }
}
