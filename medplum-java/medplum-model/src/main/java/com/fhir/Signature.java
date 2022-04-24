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
    as = ImmutableSignature.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Signature {
  Optional<List<Extension>> extension();

  List<Coding> type();

  Optional<instant> when();

  Optional<String> id();

  Reference who();

  Optional<code> sigFormat();

  Optional<Reference> onBehalfOf();

  Optional<code> targetFormat();

  Optional<base64Binary> data();

  static ImmutableSignature.WhoBuildStage builder() {
    return ImmutableSignature.builder();
  }
}
