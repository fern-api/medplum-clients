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

  Optional<String> nTerminalModification();

  Optional<Attachment> sequenceAttachment();

  Optional<Identifier> cTerminalModificationId();

  Optional<List<Extension>> extension();

  Optional<Identifier> nTerminalModificationId();

  Optional<Integer> length();

  Optional<Integer> subunit();

  Optional<String> sequence();

  Optional<String> id();

  Optional<String> cTerminalModification();

  static ImmutableSubstanceProtein_Subunit.Builder builder() {
    return ImmutableSubstanceProtein_Subunit.builder();
  }
}
