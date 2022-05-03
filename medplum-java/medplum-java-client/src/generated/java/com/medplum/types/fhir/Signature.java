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
    as = ImmutableSignature.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Signature {
  Optional<String> id();

  Reference who();

  Optional<Reference> onBehalfOf();

  Optional<Base64Binary> data();

  Optional<Code> targetFormat();

  Optional<Code> sigFormat();

  List<Coding> type();

  Optional<List<Extension>> extension();

  Optional<Instant> when();

  static ImmutableSignature.WhoBuildStage builder() {
    return ImmutableSignature.builder();
  }
}
