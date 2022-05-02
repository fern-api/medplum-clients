package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableValueSet_Contains.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Contains {
  Optional<List<Extension>> extension();

  Optional<String> version();

  Optional<List<ValueSet_Designation>> designation();

  Optional<String> id();

  @JsonProperty("abstract")
  Optional<Boolean> _abstract();

  Optional<List<ValueSet_Contains>> contains();

  Optional<Uri> system();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> code();

  Optional<String> display();

  Optional<Boolean> inactive();

  static ImmutableValueSet_Contains.Builder builder() {
    return ImmutableValueSet_Contains.builder();
  }
}
