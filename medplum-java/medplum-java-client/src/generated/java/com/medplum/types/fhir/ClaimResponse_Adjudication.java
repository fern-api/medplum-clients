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
  Optional<Decimal> value();

  Optional<Money> amount();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept category();

  Optional<CodeableConcept> reason();

  Optional<String> id();

  static ImmutableClaimResponse_Adjudication.CategoryBuildStage builder() {
    return ImmutableClaimResponse_Adjudication.builder();
  }
}
