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
    as = ImmutableClaimResponse_Adjudication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Adjudication {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> reason();

  Optional<Decimal> value();

  Optional<Money> amount();

  CodeableConcept category();

  Optional<List<Extension>> modifierExtension();

  static ImmutableClaimResponse_Adjudication.CategoryBuildStage builder() {
    return ImmutableClaimResponse_Adjudication.builder();
  }
}
