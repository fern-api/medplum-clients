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
    as = ImmutableRequestGroup_Condition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RequestGroup_Condition {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<code> kind();

  Optional<List<Extension>> extension();

  Optional<Expression> expression();

  static ImmutableRequestGroup_Condition.Builder builder() {
    return ImmutableRequestGroup_Condition.builder();
  }
}
