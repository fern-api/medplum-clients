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

  Optional<Reference> onBehalfOf();

  Optional<List<Extension>> extension();

  Reference who();

  Optional<Code> sigFormat();

  Optional<Instant> when();

  Optional<Code> targetFormat();

  Optional<Base64Binary> data();

  List<Coding> type();

  static ImmutableSignature.WhoBuildStage builder() {
    return ImmutableSignature.builder();
  }
}
