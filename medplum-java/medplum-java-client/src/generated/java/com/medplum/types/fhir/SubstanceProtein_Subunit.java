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
  Optional<Identifier> cTerminalModificationId();

  Optional<Integer> subunit();

  Optional<Integer> length();

  Optional<Identifier> nTerminalModificationId();

  Optional<String> sequence();

  Optional<Attachment> sequenceAttachment();

  Optional<String> id();

  Optional<String> cTerminalModification();

  Optional<String> nTerminalModification();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceProtein_Subunit.Builder builder() {
    return ImmutableSubstanceProtein_Subunit.builder();
  }
}
