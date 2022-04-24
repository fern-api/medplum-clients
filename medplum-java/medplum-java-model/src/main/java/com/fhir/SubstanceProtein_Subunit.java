package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Attachment> sequenceAttachment();

  Optional<Identifier> cTerminalModificationId();

  Optional<String> cTerminalModification();

  Optional<String> sequence();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Integer> subunit();

  Optional<String> nTerminalModification();

  Optional<Integer> length();

  Optional<String> id();

  Optional<Identifier> nTerminalModificationId();

  static ImmutableSubstanceProtein_Subunit.Builder builder() {
    return ImmutableSubstanceProtein_Subunit.builder();
  }
}
