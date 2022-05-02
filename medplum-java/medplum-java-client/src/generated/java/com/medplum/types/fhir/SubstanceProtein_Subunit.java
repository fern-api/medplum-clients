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
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Attachment> sequenceAttachment();

  Optional<String> nTerminalModification();

  Optional<Identifier> cTerminalModificationId();

  Optional<Integer> subunit();

  Optional<String> sequence();

  Optional<Identifier> nTerminalModificationId();

  Optional<List<Extension>> extension();

  Optional<Integer> length();

  Optional<String> cTerminalModification();

  static ImmutableSubstanceProtein_Subunit.Builder builder() {
    return ImmutableSubstanceProtein_Subunit.builder();
  }
}
