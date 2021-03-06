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
    as = ImmutableRequestGroup_Condition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RequestGroup_Condition {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Code> kind();

  Optional<List<Extension>> modifierExtension();

  Optional<Expression> expression();

  static ImmutableRequestGroup_Condition.Builder builder() {
    return ImmutableRequestGroup_Condition.builder();
  }
}
