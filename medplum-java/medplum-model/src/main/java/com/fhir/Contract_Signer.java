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
    as = ImmutableContract_Signer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Signer {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Reference party();

  List<Signature> signature();

  Optional<String> id();

  Coding type();

  static ImmutableContract_Signer.PartyBuildStage builder() {
    return ImmutableContract_Signer.builder();
  }
}
