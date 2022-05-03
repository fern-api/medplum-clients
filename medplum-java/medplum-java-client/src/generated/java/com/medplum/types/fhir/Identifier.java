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
    as = ImmutableIdentifier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Identifier {
  Optional<CodeableConcept> type();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Uri> system();

  Optional<String> value();

  Optional<Period> period();

  Optional<Reference> assigner();

  Optional<IdentifierUse> use();

  static ImmutableIdentifier.Builder builder() {
    return ImmutableIdentifier.builder();
  }
}
