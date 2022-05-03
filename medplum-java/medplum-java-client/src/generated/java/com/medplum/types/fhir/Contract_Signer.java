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
    as = ImmutableContract_Signer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Signer {
  Optional<List<Extension>> modifierExtension();

  Coding type();

  Optional<List<Extension>> extension();

  List<Signature> signature();

  Optional<String> id();

  Reference party();

  static ImmutableContract_Signer.TypeBuildStage builder() {
    return ImmutableContract_Signer.builder();
  }
}
