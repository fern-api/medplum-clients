package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSubstanceProtein_Subunit.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceProtein_Subunit {
  Optional<String> nTerminalModification();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> nTerminalModificationId();

  Optional<Integer> subunit();

  Optional<Identifier> cTerminalModificationId();

  Optional<Integer> length();

  Optional<String> cTerminalModification();

  Optional<List<Extension>> extension();

  Optional<Attachment> sequenceAttachment();

  Optional<String> sequence();

  static ImmutableSubstanceProtein_Subunit.Builder builder() {
    return ImmutableSubstanceProtein_Subunit.builder();
  }
}
