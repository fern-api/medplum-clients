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
    as = ImmutableIdentifier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Identifier {
  Optional<CodeableConcept> type();

  Optional<String> id();

  Optional<Period> period();

  Optional<Reference> assigner();

  Optional<uri> system();

  Optional<IdentifierUse> use();

  Optional<List<Extension>> extension();

  Optional<String> value();

  static ImmutableIdentifier.Builder builder() {
    return ImmutableIdentifier.builder();
  }
}
